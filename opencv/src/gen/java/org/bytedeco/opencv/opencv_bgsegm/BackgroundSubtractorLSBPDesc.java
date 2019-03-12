// Targeted by JavaCPP version 1.5-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_bgsegm;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.opencv.global.opencv_bgsegm.*;


/** \brief This is for calculation of the LSBP descriptors.
 */
@Namespace("cv::bgsegm") @Properties(inherit = org.bytedeco.opencv.presets.opencv_bgsegm.class)
public class BackgroundSubtractorLSBPDesc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BackgroundSubtractorLSBPDesc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BackgroundSubtractorLSBPDesc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackgroundSubtractorLSBPDesc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BackgroundSubtractorLSBPDesc position(long position) {
        return (BackgroundSubtractorLSBPDesc)super.position(position);
    }

    public static native void calcLocalSVDValues(@ByVal Mat localSVDValues, @Const @ByRef Mat frame);
    public static native void calcLocalSVDValues(@ByVal UMat localSVDValues, @Const @ByRef Mat frame);
    public static native void calcLocalSVDValues(@ByVal GpuMat localSVDValues, @Const @ByRef Mat frame);

    public static native void computeFromLocalSVDValues(@ByVal Mat desc, @Const @ByRef Mat localSVDValues, @Cast("const cv::Point2i*") Point LSBPSamplePoints);
    public static native void computeFromLocalSVDValues(@ByVal UMat desc, @Const @ByRef Mat localSVDValues, @Cast("const cv::Point2i*") Point LSBPSamplePoints);
    public static native void computeFromLocalSVDValues(@ByVal GpuMat desc, @Const @ByRef Mat localSVDValues, @Cast("const cv::Point2i*") Point LSBPSamplePoints);

    public static native void compute(@ByVal Mat desc, @Const @ByRef Mat frame, @Cast("const cv::Point2i*") Point LSBPSamplePoints);
    public static native void compute(@ByVal UMat desc, @Const @ByRef Mat frame, @Cast("const cv::Point2i*") Point LSBPSamplePoints);
    public static native void compute(@ByVal GpuMat desc, @Const @ByRef Mat frame, @Cast("const cv::Point2i*") Point LSBPSamplePoints);
}