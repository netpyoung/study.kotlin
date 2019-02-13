package com.example.netpyoung.test1.ui.main

import android.Manifest
import android.app.AlertDialog
import android.content.Context
import android.content.pm.PackageManager
import android.graphics.SurfaceTexture
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.example.netpyoung.test1.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment : Fragment() {
    private val surfaceTextureListener = object : TextureView.SurfaceTextureListener {
        override fun onSurfaceTextureAvailable(texture: SurfaceTexture, width: Int, height: Int) {
            openCamera(width, height)
        }
        override fun onSurfaceTextureSizeChanged(texture: SurfaceTexture, width: Int, height: Int) {
            configureTransform(width, height)
        }
        override fun onSurfaceTextureDestroyed(texture: SurfaceTexture) = true
        override fun onSurfaceTextureUpdated(texture: SurfaceTexture) = Unit
    }

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private val REQUEST_CAMERA_PERMISSION: Int = 0x01

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel


        btn_ok.setOnClickListener {
            txt_id.text = "HelloWorld"
        }

        textview_hello.surfaceTextureListener = surfaceTextureListener
    }


    // utils
    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        if (requestCode == REQUEST_CAMERA_PERMISSION) {
            if (grantResults.size != 1 || grantResults[0] != PackageManager.PERMISSION_GRANTED) {
                Log.e("WTF", "fail to get")
            }
        } else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        }
    }

    private fun requestPermission(permission: String): Boolean {
        Log.d("WTF", "1")
        if (this.activity?.shouldShowRequestPermissionRationale(permission)!!) {
            Log.d("WTF", "2")

            AlertDialog.Builder(activity)
                .setMessage("request permision")
                .setPositiveButton(android.R.string.ok) { _, _ ->
                    this.activity?.requestPermissions(arrayOf(Manifest.permission.CAMERA), REQUEST_CAMERA_PERMISSION)
                }
                .setNegativeButton(android.R.string.cancel) { _, _ ->
                    //this.activity?.finish()
                }
                .create()
        } else {
            Log.d("WTF", "3 $activity")
            this.activity?.requestPermissions(arrayOf(Manifest.permission.CAMERA), REQUEST_CAMERA_PERMISSION)
        }
        return false
    }

    private fun Context?.isAllowedPermission(permission: String): Boolean {
        this ?: return false
        return ContextCompat.checkSelfPermission(this!!, permission) == PackageManager.PERMISSION_GRANTED
    }

    // camera
    private fun openCamera(width: Int, height: Int) {
        if (!this.activity.isAllowedPermission(Manifest.permission.CAMERA)) {

            this.requestPermission(Manifest.permission.CAMERA)
            Log.e("WTF", "helo2")

            return
        }
        var isAllowedPermision = this.activity.isAllowedPermission(Manifest.permission.CAMERA);
        Log.e("WTF", "helo $isAllowedPermision")
    }

    private fun configureTransform(width: Int, height: Int) {
        activity ?: return
    }
}
