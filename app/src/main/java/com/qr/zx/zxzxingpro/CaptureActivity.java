package com.qr.zx.zxzxingpro;

import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.zxing.Result;

import butterknife.Bind;
import butterknife.ButterKnife;

public final class CaptureActivity extends CaptureBaseActivity implements SurfaceHolder.Callback {

    private static final String TAG = CaptureActivity.class.getSimpleName();
    @Bind(R.id.sv_background)
    SurfaceView mSvBackground;
    @Bind(R.id.rl_scan_line)
    ImageView mRlScanLine;
    @Bind(R.id.rl_crop)
    RelativeLayout mRlCrop;
    @Bind(R.id.rl_container)
    RelativeLayout mRlContainer;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capture);
        ButterKnife.bind(this);
        initData();
        initView();

    }

    private void initData() {

    }

    private void initView() {
        setCaptureActivity(this);
        setSvBackground(mSvBackground);
        setRlCrop(mRlCrop);
        setRlContainer(mRlContainer);
        mRlScanLine.startAnimation(mAnimation);
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    public void handleDecode(Result rawResult, Bundle bundle) {
        super.handleDecode();
        Toast.makeText(getApplicationContext(), rawResult.getText() + "", Toast.LENGTH_SHORT).show();

		/*bundle.putInt("width", mCropRect.width());
        bundle.putInt("height", mCropRect.height());
		bundle.putString("result", rawResult.getText());

		startActivity(new Intent(CaptureActivity.this, ResultActivity.class).putExtras(bundle));*/
    }




}