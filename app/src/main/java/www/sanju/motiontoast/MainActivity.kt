package www.sanju.motiontoast

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bcstar.toast.NXColorToast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        successBtn.setOnClickListener(this)
        errorBtn.setOnClickListener(this)
        warningBtn.setOnClickListener(this)
        infoBtn.setOnClickListener(this)
        deleteBtn.setOnClickListener(this)
        noInternetBtn.setOnClickListener(this)

        successBtn.setOnLongClickListener(this)
        errorBtn.setOnLongClickListener(this)
        warningBtn.setOnLongClickListener(this)
        infoBtn.setOnLongClickListener(this)
        deleteBtn.setOnLongClickListener(this)
        noInternetBtn.setOnLongClickListener(this)


    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.successBtn -> {
              /*  MotionToast.createToast(this,"Profile Completed!",
                MotionToast.TOAST_SUCCESS,
                MotionToast.GRAVITY_BOTTOM,
                MotionToast.LONG_DURATION
               )*/
                NXColorToast.NXCustomToast(context = this,message = "再点击一次，退出该应用!",
                  position =   NXColorToast.GRAVITY_TOP

                )
            }
            R.id.errorBtn -> {
                NXColorToast.NXCreateToast(this,"发送验证码，15613365692号码,\n请稍查收!",
                    NXColorToast.TOAST_ERROR,
                    NXColorToast.GRAVITY_TOP,
                    NXColorToast.LONG_DURATION
                   )         }
            R.id.warningBtn ->{

                NXColorToast.NXCreateToast(this,"Please Fill All The Details!",
                    NXColorToast.TOAST_WARNING,
                    NXColorToast.GRAVITY_BOTTOM,
                    NXColorToast.LONG_DURATION
                   )
            }
            R.id.infoBtn ->{

                NXColorToast.NXCreateToast(
                    this, "Color Toast testing here!",
                    NXColorToast.TOAST_INFO,
                    NXColorToast.GRAVITY_BOTTOM,
                    NXColorToast.LONG_DURATION
                    )
            }
            R.id.deleteBtn ->{
                NXColorToast.NXCreateToast(this,"Profile Deleted!",
                    NXColorToast.TOAST_DELETE,
                    NXColorToast.GRAVITY_BOTTOM,
                    NXColorToast.LONG_DURATION
                    )
            }
            R.id.noInternetBtn -> {
                NXColorToast.NXCreateToast(
                    this, "亲,没有网络了!",
                    NXColorToast.TOAST_NO_INTERNET,
                    NXColorToast.GRAVITY_BOTTOM,
                    NXColorToast.LONG_DURATION

                )
            }
        }

    }

    override fun onLongClick(v: View?): Boolean {

        when (v!!.id) {
            R.id.successBtn -> {
                NXColorToast.darkToast(
                    this, "Profile Completed!",
                    NXColorToast.TOAST_SUCCESS,
                    NXColorToast.GRAVITY_BOTTOM,
                    NXColorToast.LONG_DURATION

                )
            }
            R.id.errorBtn -> {
                NXColorToast.darkToast(
                    this, "Profile Update Failed!",
                    NXColorToast.TOAST_ERROR,
                    NXColorToast.GRAVITY_BOTTOM,
                    NXColorToast.LONG_DURATION

                )
            }
            R.id.warningBtn -> {

                NXColorToast.darkToast(
                    this, "Please Fill All The Details!",
                    NXColorToast.TOAST_WARNING,
                    NXColorToast.GRAVITY_BOTTOM,
                    NXColorToast.LONG_DURATION
                )
            }
            R.id.infoBtn -> {

                NXColorToast.darkToast(
                    this, "Dark ui testing here!",
                    NXColorToast.TOAST_INFO,
                    NXColorToast.GRAVITY_BOTTOM,
                    NXColorToast.LONG_DURATION
                )
            }
            R.id.deleteBtn -> {
                NXColorToast.darkToast(
                    this, "Profile Deleted!",
                    NXColorToast.TOAST_DELETE,
                    NXColorToast.GRAVITY_BOTTOM,
                    NXColorToast.LONG_DURATION

                )
            }
            R.id.noInternetBtn -> {
                NXColorToast.darkToast(
                    this, "亲,没有网络了!",
                    NXColorToast.TOAST_NO_INTERNET,
                    NXColorToast.GRAVITY_BOTTOM,
                    NXColorToast.LONG_DURATION

                )
            }
        }

        return true
    }
}
