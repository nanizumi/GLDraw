package hernani.pdm.gldraw;

import android.content.Context;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by hernani on 02/11/2014.
 */
public class MyGLSurfaceView extends GLSurfaceView {
    public final MyGlRenderer mRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);

        setEGLContextClientVersion(2);

        //set the renderer for drawing
        mRenderer = new MyGlRenderer();

        setRenderer(mRenderer);

        setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
    }
}
