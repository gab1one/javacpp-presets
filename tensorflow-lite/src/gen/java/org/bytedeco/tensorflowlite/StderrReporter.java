// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// An error reporter that simply writes the message to stderr.
@Namespace("tflite") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class StderrReporter extends ErrorReporter {
    static { Loader.load(); }
    /** Default native constructor. */
    public StderrReporter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StderrReporter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StderrReporter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public StderrReporter position(long position) {
        return (StderrReporter)super.position(position);
    }
    @Override public StderrReporter getPointer(long i) {
        return new StderrReporter((Pointer)this).offsetAddress(i);
    }

  public native int Report(@Cast("const char*") BytePointer format, @ByVal @Cast("va_list*") Pointer args);
  public native int Report(String format, @ByVal @Cast("va_list*") Pointer args);
}