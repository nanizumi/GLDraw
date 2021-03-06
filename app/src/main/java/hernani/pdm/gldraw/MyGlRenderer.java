package hernani.pdm.gldraw;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/**
 * Created by hernani on 03/11/2014.
 */
public class MyGlRenderer implements GLSurfaceView.Renderer{
    private static final String TAG="MyGLRenderer";

    @Override
    public void onSurfaceCreated(GL10 unused, EGLConfig eglConfig) {
        //Set the background
        GLES20.glClearColor(0.0f,0.0f,0.0f,1.0f);
    }

    @Override
    public void onSurfaceChanged(GL10 unused, int i, int i2) {
        GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
    }

    public void onDrawFrame(GL10 unused, int width, int height) {
        GLES20.glViewport(0,0, width, height);

    }

    public void onDrawFrame(GL10 unused) {
        //GLES20.glViewport(0,0, width, height);

    }
}
