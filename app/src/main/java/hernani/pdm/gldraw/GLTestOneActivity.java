package hernani.pdm.gldraw;

import android.app.Activity;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

/**
 * Created by hernani on 02/11/2014.
 */
public class GLTestOneActivity extends Activity {
    private GLSurfaceView mGLView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //create GL View
        mGLView = new MyGLSurfaceView(this);
        setContentView(mGLView);
    }
}
