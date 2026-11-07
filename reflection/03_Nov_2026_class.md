# Reflection — 3 November 2026

## Topics Covered

- RGB colour channels and pixel representation
- RGBA colour model and alpha transparency
- 32-bit integer (`int32`) pixel storage
- Different channel arrangements (RGBA, ARGB, BGRA and ABGR)
- Endianness: Little Endian and Big Endian

## 1. Understanding RGB in Digital Images

In this session, I learned about the RGB colour model, which is used to represent colours in digital images. RGB stands for Red, Green and Blue. These three primary colour components are combined in different proportions to produce various colours.

Every pixel in an RGB image contains three intensity values:

- Red (R): Represents the intensity of red.
- Green (G): Represents the intensity of green.
- Blue (B): Represents the intensity of blue.

```
Pixel (x, y) = [Red, Green, Blue]
```

### Channel Intensity Range

In a standard 24-bit RGB image, each colour channel occupies 8 bits. Therefore, every channel can have values between 0 and 255, giving 256 possible intensity levels.

- `0` represents the absence of that particular colour.
- `255` represents the highest intensity of that colour.

Some common colour combinations are:

- `(0, 0, 0)` – Black
- `(255, 255, 255)` – White
- `(255, 0, 0)` – Red
- `(0, 255, 0)` – Green
- `(0, 0, 255)` – Blue
- `(255, 255, 0)` – Yellow

I understood that different combinations of these three channels allow digital devices to display millions of colours.

## 2. Understanding RGBA and the Alpha Channel

I also learned about the RGBA colour model, which is an extension of RGB. It includes an additional component called the Alpha channel, which determines the transparency or opacity of a pixel.

An RGBA pixel consists of four values:

- Red (R): Red colour intensity.
- Green (G): Green colour intensity.
- Blue (B): Blue colour intensity.
- Alpha (A): Controls the transparency level.

The alpha value generally ranges from 0 to 255:

```
Alpha = 0    → Completely transparent
Alpha = 128  → Approximately 50% opaque
Alpha = 255  → Completely opaque
```

The alpha channel is useful when combining multiple images, placing objects over different backgrounds and creating transparent graphical elements. It is also used for smooth edges in text and graphical interfaces.

### Storage of Pixels Using 32-Bit Integers

Another concept covered was how an RGBA pixel can be stored as a single 32-bit integer (`int32`).

Since each of the four channels requires 8 bits, the total storage required is:

```
4 channels × 8 bits = 32 bits = 4 bytes
```

The four channels are stored together in a single integer, with each channel occupying a separate 8-bit section.

This representation supports approximately 4.29 billion possible combinations of colour and transparency values. It also makes pixel data convenient to handle using standard 32-bit processor operations.

## 3. Arrangement of Pixel Channels in Memory

I learned that although an image pixel contains the same four components (Red, Green, Blue and Alpha), their arrangement in memory can differ depending on the graphics framework, hardware or file format being used.

The four common channel arrangements are:

| Format | Arrangement             |
| ------ | ----------------------- |
| RGBA   | Red, Green, Blue, Alpha |
| ARGB   | Alpha, Red, Green, Blue |
| BGRA   | Blue, Green, Red, Alpha |
| ABGR   | Alpha, Blue, Green, Red |

### Common Channel Formats

1\. RGBA

- Stores the channels in the order Red, Green, Blue and Alpha.
- Commonly used in OpenGL, WebGL, HTML5 Canvas and PNG image data.

2\. ARGB

- Stores Alpha first, followed by Red, Green and Blue.
- Used in Java AWT and several desktop graphics applications.

3\. BGRA

- Arranges the channels as Blue, Green, Red and Alpha.
- Commonly used in graphics systems such as DirectX and other rendering frameworks.

4\. ABGR

- Stores Alpha, Blue, Green and Red in sequence.
- Used in certain specialised graphics systems and image buffers.

Understanding these arrangements is important because using an incorrect channel order can produce unexpected colour changes. For example, if BGRA data is interpreted as RGBA, the red and blue components get exchanged, resulting in incorrect image colours.

## 4. Understanding Endianness: Little Endian and Big Endian

Another important topic discussed in class was endianness. It refers to the order in which multiple bytes of a data value are arranged in computer memory.

When a 32-bit integer is stored in memory, its four bytes can be arranged in two different ways: Big Endian or Little Endian.

### Big Endian

- The Most Significant Byte (MSB) is stored at the lowest memory address.
- The bytes are arranged in the same order in which the number is normally written.
- It is also known as network byte order.

### Little Endian

- The Least Significant Byte (LSB) is stored at the lowest memory address.
- The byte arrangement is reversed compared to Big Endian.
- It is commonly used by modern processors such as Intel and AMD systems and ARM processors in their usual little-endian configuration.

### Difference Between Big Endian and Little Endian

For example, consider a 32-bit hexadecimal value:

```
0xAARRGGBB
```

Its memory arrangement will be different depending on the endianness.

| Memory Address | Big Endian | Little Endian |
| -------------- | ---------- | ------------- |
| Address + 0    | Alpha (AA) | Blue (BB)     |
| Address + 1    | Red (RR)   | Green (GG)    |
| Address + 2    | Green (GG) | Red (RR)      |
| Address + 3    | Blue (BB)  | Alpha (AA)    |

This helped me understand that the same 32-bit integer can have different byte arrangements in physical memory.

### Connection Between Endianness and Pixel Representation

One important point I learned is that the way a pixel is represented in a program is not necessarily the same as its physical byte arrangement in memory.

For example, when an integer is represented as `0xAARRGGBB`, a Big Endian system stores its bytes as:

```
[AA, RR, GG, BB]
```

Whereas a Little Endian system stores them as:

```
[BB, GG, RR, AA]
```

Therefore, an ARGB integer can appear as a BGRA byte sequence when stored in memory on a Little Endian machine. This distinction is important when handling image data and transferring pixels between different graphics systems.

## Overall Reflection

Through this session, I gained a better understanding of how colours and pixels are represented and stored in digital images. I learned how the RGB model combines three primary colour channels to produce different colours and how the RGBA model adds transparency through the alpha channel.

I also understood how four channel values can be combined into a single 32-bit integer and how different graphics systems arrange these channels in memory. The concepts of Big Endian and Little Endian helped me understand why the same pixel value can have different byte sequences depending on the computer architecture.

Overall, this session helped me understand the internal representation of digital images and how colour information is managed at the memory level. These concepts will be useful when working with image processing, pixel manipulation and Java-based graphics applications.
