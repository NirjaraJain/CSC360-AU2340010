# Reflection — 10 September 2026

## Topics Covered

- Streaming vs downloading
- Streaming in graphics
- Server-side rendering vs client-side rendering
- Storing images and image metadata
- Platform abstraction in AWT

---

## What is the Difference Between Streaming and Downloading?

Both streaming and downloading transfer data from a remote system to your device. The main difference is **how the data is used and stored**.

### Streaming

Streaming sends data in small parts so that you can start using it before the entire file is received.

For example, when watching an online video, the video player receives a small amount of data, starts playing it, and continues downloading the rest in the background.

Examples:

- Watching an online video
- Listening to online radio
- Playing a cloud game
- Using a remote desktop
- Watching a live camera feed

Streaming can be:

- **Live** — content is sent while it is being created.
- **On-demand** — already stored content is sent in small parts.

### Downloading

Downloading transfers a file to your device so that you can use it later.

Examples:

- Downloading a software installer
- Saving a photo
- Downloading a movie for offline watching
- Downloading a document from cloud storage

### Streaming vs Downloading

| Feature | Streaming | Downloading |
|---|---|---|
| Start time | Can start after a small amount of data is received | Usually starts after enough or all data is downloaded |
| Internet | Usually needed while using the content | Needed during download, but not afterward |
| Storage | Usually uses temporary storage or cache | Stores the complete file |
| Seeking | May need to download another section | Usually immediate after download |
| Quality | Can change depending on network speed | Usually stays the same |
| Repeated use | May use data again if not cached | Uses the saved local copy |
| Live content | Can support live content | Cannot download a complete file that does not exist yet |
| Access | Often controlled by the service | User usually has a local copy, depending on licensing and DRM |

### Data Usage

Streaming does not always use more data than downloading.

If you watch the same content once at the same quality, both methods can use a similar amount of data.

Data usage depends on:

- Video resolution
- Frame rate
- Compression
- Network speed
- Adaptive quality
- How much content is watched
- Repeated playback
- Caching
- Network overhead

Streaming can save data when you only watch part of a video.

Downloading can save data when you use the same file many times because the file is already stored on your device.

### Buffering and Quality Adjustment

Streaming uses a **buffer** to store some data before it is played.

If the internet becomes slow and the buffer becomes empty, the video or audio may pause. This is called **buffering**.

Adaptive bitrate streaming stores the same content at different quality levels. The player chooses the quality based on:

- Internet speed
- Device capabilities
- Current network conditions

This can reduce buffering, but the quality may change during playback.

---

## Where is Streaming Used in Graphics?

In graphics, streaming can mean either:

1. Sending completed visual output to another device.
2. Loading graphics resources only when they are needed.

### 1. Video Streaming

Video platforms compress video and audio and divide them into small segments.

These segments are sent to the media player as needed.

Compression reduces the amount of data that needs to be transferred.

Adaptive bitrate streaming can also change the video quality depending on the network.

### 2. Texture and Model Streaming

Games and 3D applications can contain a very large number of:

- Textures
- 3D models
- Terrain
- Animations
- Other graphics assets

It may not be possible to keep everything in memory at the same time.

Instead, the application loads the assets that are currently needed and removes assets that are no longer needed.

This can:

- Reduce loading time
- Reduce memory usage
- Support large game worlds
- Load high-quality assets when they are needed

Assets can be loaded from local storage, a network server, or both.

### 3. Cloud Gaming

In cloud gaming:

1. The game runs on a remote server.
2. The server renders the game graphics.
3. The rendered frames are converted into video.
4. The video and audio are streamed to the player's device.
5. The player's controls are sent back to the server.

This means the user's device does not need to perform all the heavy graphics processing.

However, cloud gaming depends heavily on:

- Network speed
- Latency
- Jitter
- Video quality

Google Stadia was a historical example of cloud gaming. NVIDIA GeForce NOW and similar services continue to use this approach.

### 4. Remote Desktop and Visualization

Remote desktop and applications such as:

- CAD
- Medical imaging
- Scientific visualization
- Simulations

can render graphics on a powerful remote computer and send the result to another device.

The client sends user actions to the server, and the server sends back updated graphics.

This can reduce the need to transfer large datasets to the user's device.

### 5. Virtual and Augmented Reality

VR and AR applications can stream:

- High-resolution scenes
- 3D data
- Remotely rendered frames

These applications require very low latency because delays can affect the user experience.

Techniques such as:

- Level of detail
- Foveated rendering
- Prediction
- Local reprojection

can help reduce latency and bandwidth usage.

### 6. Progressive Image and Geometry Loading

Large images, maps, point clouds, and 3D models can be loaded gradually.

A low-quality version can appear first, followed by higher-quality details.

This allows the user to see something quickly instead of waiting for the complete high-resolution file.

---

## Server-Side Rendering and Client-Side Rendering

### Server-Side Rendering (SSR)

With **server-side rendering**, the server creates the HTML page and sends the finished HTML to the browser.

JavaScript can then make the page interactive. This process is called **hydration**.

### Client-Side Rendering (CSR)

With **client-side rendering**, the server initially sends a basic HTML structure and JavaScript files.

The browser runs the JavaScript, gets the required data, and creates the page content.

### Advantages of SSR

SSR can be useful for public websites and content-based pages because:

- **Content can appear earlier:** The browser receives useful HTML directly from the server.
- **Better search indexing:** Search engines can more easily read the page content.
- **Better link previews:** Social media and messaging services can see the page content and metadata.
- **Better reliability:** Some content may still appear if JavaScript loads slowly or fails.
- **Caching:** Server-rendered pages can sometimes be cached by servers or CDNs.

### Disadvantages of SSR

SSR also has some disadvantages:

- The server has to do more work.
- Dynamic pages may take longer to generate.
- The page may appear before it becomes interactive.
- Hydration requires JavaScript.
- Some work may happen both on the server and browser.
- Personalized pages can be harder to cache.
- The application can become more complex.

### Advantages of CSR

CSR is often useful for highly interactive applications such as:

- Dashboards
- Admin panels
- Design tools
- Applications used after login

Benefits include:

- Fast navigation after the application has loaded
- Rich user interaction
- More control over application state
- Less server-side HTML rendering
- Can use static hosting for the application shell
- Clear separation between frontend and backend APIs

### Disadvantages of CSR

The main disadvantages are:

- Large JavaScript files can make the first load slower.
- The application depends heavily on JavaScript.
- Search engine indexing can be more difficult.
- Link previews may require additional support.

### SSR vs CSR

| Feature | SSR | CSR |
|---|---|---|
| Initial HTML | Contains page content | Often contains an application shell |
| JavaScript | Content can appear before JavaScript finishes | JavaScript usually creates the content |
| Server workload | Higher | Lower for HTML rendering |
| First visit | Can show content earlier | Can be slower with large JavaScript files |
| Later navigation | May require server requests | Often fast after initial loading |
| SEO | Generally easier | May require extra support |
| Interactivity | Usually available after hydration | Available after JavaScript loads |
| Caching | HTML can sometimes be cached | Static files and API responses can be cached |

Modern web frameworks often use a **hybrid approach** that combines SSR, static generation, CSR, and selective hydration.

### Accessibility

SSR does not automatically make a website accessible, and CSR does not automatically make it inaccessible.

Accessibility mainly depends on how the application is built.

Important factors include:

- Semantic HTML
- Keyboard support
- Proper focus management
- Labels and descriptions
- Good color contrast
- Proper handling of dynamic content
- Testing with assistive technologies

SSR can help because content may be available before JavaScript runs.

However, a properly designed CSR application can also be accessible.

---

## How Should Images Be Stored?

Amazon S3 is commonly used for storing images.

However, S3 is an **object storage service**, not a traditional database.

### Recommended Approach

A common design is:

- Store the actual image file in object storage.
- Store information about the image in a database.

The database can contain:

- Image ID
- Object key or URL
- Original filename
- MIME type
- Width and height
- File size
- Owner ID
- Upload time
- Access permissions
- Checksum or content hash

Example:

```text
Database
├── id: 42
├── object_key: images/users/42/profile.webp
├── media_type: image/webp
├── width: 512
├── height: 512
└── owner_id: 1001

Object Storage
└── images/users/42/profile.webp → actual image data
