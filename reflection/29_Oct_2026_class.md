# Reflection — 29 October 2026
**Topics: Image Contrast, Histograms, and Image Filtering**

During this session, I learned about some important concepts in digital image processing, including image contrast, histograms, and different types of filters. The session helped me understand how pixel intensity values affect the appearance of an image and how various techniques can be used to improve image quality, reduce noise, and identify important features.

### 1. Understanding Image Contrast

I learned that contrast refers to the difference between the brighter and darker regions of an image. It plays an important role in determining how clearly objects and their boundaries can be distinguished from the background.

We discussed two major types of contrast:

- **High Contrast:** Images with high contrast have a greater difference between their light and dark regions. This makes edges, shapes, and other details more noticeable and gives the image a sharper appearance.
- **Low Contrast:** In low-contrast images, pixel intensity values are concentrated within a smaller range. As a result, the image may appear dull or faded, and distinguishing smaller details becomes more difficult.

I also understood that contrast is important in computer vision because clear differences between objects and their backgrounds can improve tasks such as edge detection, object identification, and image segmentation.

### 2. Understanding Image Histograms

Another topic covered during the session was image histograms. I learned that a histogram represents how frequently different pixel intensity values occur in an image.

For an 8-bit grayscale image, intensity values range from 0 to 255, where 0 represents black and 255 represents white. The horizontal axis represents the intensity levels, while the vertical axis indicates the number of pixels having each intensity value.

By examining a histogram, we can understand different properties of an image:

- **Underexposed Images:** Their pixel values are mostly concentrated toward the darker end of the histogram.
- **Overexposed Images:** Most pixel values appear toward the brighter end.
- **Contrast Analysis:** A histogram covering a narrow range of intensity values generally indicates low contrast, whereas a wider distribution indicates higher contrast.

I also learned about histogram equalization, which is used to improve image contrast by redistributing intensity values. Another application is thresholding, where intensity values are used to separate objects or foreground regions from the background. We also discussed Otsu's method as an approach for selecting an appropriate threshold.

### 3. Understanding Image Filters

I also learned how filters are used in image processing to modify pixel values and improve the overall appearance of an image. Filters generally work by examining a pixel along with the values of its surrounding neighbouring pixels.

We discussed how spatial convolution works using a small matrix called a kernel. The kernel moves across the image, and its values are multiplied with the corresponding pixel intensities in the neighbourhood. The resulting products are added together to calculate the new value of the output pixel.

Some commonly used filters discussed during the session were:

- **Gaussian Filter:** Used to smooth images and reduce noise by applying weighted averaging. It is particularly useful for reducing Gaussian noise and producing a blurred effect.
- **Median Filter:** Replaces a pixel with the median value of its surrounding neighbourhood. It is useful for removing salt-and-pepper noise while maintaining relatively sharp edges.
- **Sobel and Laplacian Filters:** These filters are used to identify edges and boundaries by calculating intensity changes in an image. They are useful in feature extraction and detecting object outlines.
- **Sharpening Filter:** Enhances edges and fine details by emphasizing differences in pixel intensity, making the image appear clearer and more defined.

### What I Learned

This session helped me understand how different image processing techniques work and how they contribute to improving image quality.

I learned how contrast affects the visibility of objects, how histograms help analyze the distribution of pixel intensities, and how filters modify images based on mathematical operations. I also gained a better understanding of how convolution kernels are applied to neighbouring pixels to produce different visual effects.

### Overall Reflection

Overall, this session provided a better understanding of the fundamental concepts used in digital image processing. I realized that techniques such as contrast enhancement, histogram analysis, and filtering are important for preparing images for further processing and analysis. These concepts are also useful in computer vision applications, where improving image quality and identifying important features are essential for obtaining accurate results.
