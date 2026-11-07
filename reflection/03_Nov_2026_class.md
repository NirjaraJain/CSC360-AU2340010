Reflection --- 3 November 2026
Topics Covered
- RGB and RGBA colour models
- The role of the alpha channel
- Storing pixels in 32-bit integers
- Bitwise packing and unpacking of pixel values
- Planar and packed memory layouts
- Channel ordering: RGBA, ARGB, BGRA and ABGR
- Big-endian and little-endian byte arrangements
- Handling pixel data in Java
1. Understanding the RGB Colour Model
In this session, I learned how digital images represent colours using
the RGB model. RGB stands for Red, Green and Blue. Each pixel in an
image contains three values that indicate the intensity of these colour
components.

Usually, each channel is represented using 8 bits, which means its value
can range from 0 to 255. A value of 0 indicates that the colour
component is absent, while 255 represents its maximum intensity. By
combining different intensities of red, green and blue, a computer can
display approximately 16.7 million colours.

For example:
- Red: (255, 0, 0)
- Green: (0, 255, 0)
- Blue: (0, 0, 255)
- Yellow: (255, 255, 0)
- White: (255, 255, 255)
- Black: (0, 0, 0)
This helped me understand that the colours visible in a digital image
are created by combining the intensity values of its individual colour
channels.
2. Understanding the RGBA Model and Alpha Channel
I also learned that RGBA is an extension of RGB. It contains four
components: Red, Green, Blue and Alpha. The alpha channel controls
how transparent or opaque a pixel appears.

The alpha value is generally stored in 8 bits and ranges from 0 to 255:
- 0 means completely transparent.
- 255 means completely opaque.
- Values between 1 and 254 represent different levels of transparency.
The alpha channel is useful when placing images or objects over
different backgrounds, combining multiple layers, and creating smooth
edges around text or shapes. Image formats such as PNG can use
transparency to display objects without an unwanted rectangular
background.

I understood alpha blending as the process of combining a foreground
colour with a background colour. The result depends on the opacity of
the foreground pixel:
alpha = Alpha_A / 255.0

Output Colour = (alpha * Foreground Colour)
              + ((1 - alpha) * Background Colour)
The class also introduced two ways of storing alpha information. In
straight alpha, the RGB values are stored separately and alpha is
applied during rendering. In premultiplied alpha, each RGB component
is multiplied by the alpha value before compositing. This can make
blending more efficient and help avoid dark edges around transparent
objects.
3. Storing a Pixel as a 32-Bit Integer
Another important concept was how a pixel can be stored in memory.
Instead of keeping the alpha, red, green and blue values separately,
they can be combined into one 32-bit integer. Since each channel uses 8
bits, four channels together require 32 bits, or 4 bytes.

A common arrangement is ARGB:
| Alpha (8 bits) | Red (8 bits) | Green (8 bits) | Blue (8 bits) |
Using a 32-bit integer can make pixel storage and processing convenient.
It also provides 4-byte alignment, which is suitable for many modern
processors. SIMD instructions can process multiple data values
efficiently, and storing the complete pixel in one integer makes it
easier to copy or manipulate the pixel as a unit.
Packing and Unpacking Pixel Values
I learned that bitwise operators can combine individual channel values
into one integer. The left-shift operator (<<) moves each channel into
its required position, while the bitwise OR operator (|) combines the
values.
packedPixel = (alpha << 24) | (red << 16) | (green << 8) | blue;
The reverse process is called unpacking. Right shifts move the required
channel into position, and the AND operator with 0xFF extracts its
8-bit value.
alpha = (packedPixel >>> 24) & 0xFF;
red   = (packedPixel >>> 16) & 0xFF;
green = (packedPixel >>> 8) & 0xFF;
blue  = packedPixel & 0xFF;
This showed me how low-level bitwise operations are used to access and
modify colour information in digital images.
4. How Pixel Channels Are Arranged in Memory
The arrangement of pixel information in memory is another important
aspect of image processing. I learned about two common layouts:
- Planar layout: All values belonging to one channel are stored
  together. For example, the red values are stored first, followed by
  the green, blue and alpha values.
- Packed or interleaved layout: The colour components of each
  pixel are stored next to one another. For example, the memory may
  contain the sequence RGBARGBARGBA.
The order of the channels in packed memory is not always the same. Some
common arrangements are:

  Format   Channel sequence
  RGBA     Red, Green, Blue, Alpha
ARGB     Alpha, Red, Green, Blue
BGRA     Blue, Green, Red, Alpha
ABGR     Alpha, Blue, Green, Red

Different graphics frameworks and platforms may use different channel
arrangements. Therefore, it is important to know the expected format
when transferring image data between applications or libraries. If the
channel order is interpreted incorrectly, colours can appear distorted.
For example, confusing RGBA with BGRA can swap the red and blue
components.
5. Understanding Endianness
The session also covered endianness, which describes the order in
which the bytes of a multi-byte value are stored in computer memory.

There are two main types:
- Big-endian: The most significant byte (MSB) is stored at the
  lowest memory address.
- Little-endian: The least significant byte (LSB) is stored at the
  lowest memory address.
For example, consider the hexadecimal value 0x12345678.
Big-endian:    12  34  56  78
Little-endian: 78  56  34  12
In big-endian storage, the bytes follow the order in which the number is
normally written. In little-endian storage, the byte order is reversed
in memory. Most modern desktop processors, including common Intel and
AMD systems, use little-endian representation.
Connection Between Endianness and Pixel Storage
I found it important to distinguish between the way a pixel integer is
written in code and the way its bytes are arranged in physical memory.

For example, an ARGB integer can be represented as:
0xAARRGGBB
On a big-endian system, its bytes are stored as AA RR GG BB. On a
little-endian system, the same integer is stored as BB GG RR AA.

This explains why a pixel represented as ARGB in a 32-bit integer may
appear as BGRA when its bytes are examined in memory on a little-endian
machine. Understanding this difference helps prevent errors when working
with image buffers and graphics APIs.
6. Applying These Concepts in Java
The practical part of the topic involved Java classes used for handling
image data and byte order. The BufferedImage class is useful for
working with images, while ByteBuffer and ByteOrder can be used to
demonstrate how integer values are stored in different byte orders.

The packARGB() method combines four channel values into a single
integer. The unpackARGB() method extracts the individual channel
values from that integer. The ByteBuffer class can then demonstrate
the difference between big-endian and little-endian storage.

This helped connect the theoretical concepts of pixel representation and
memory layout with their implementation in Java.
Overall Reflection
This session helped me understand that a digital image is not simply a
collection of visible colours; it is also a structured collection of
numerical values stored and processed in memory. I learned how RGB
represents colour, how the alpha channel adds transparency, and how four
channel values can be combined into a 32-bit integer.

I also understood the difference between planar and packed image
layouts, along with the common channel orders used by graphics systems.
The discussion of endianness clarified why the same integer can have a
different byte sequence in memory depending on the processor
architecture.

Overall, these concepts gave me a better understanding of how image
pixels are represented, stored and handled in Java. They will be useful
when implementing image-processing operations and working with image
buffers in future practical tasks.
