package com.bcstar.toast

import android.app.Activity
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.PorterDuffColorFilter
import android.view.Gravity
import android.view.LayoutInflater
import android.view.animation.AnimationUtils
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import kotlinx.android.synthetic.main.full_color_toast.view.*
import kotlinx.android.synthetic.main.motion_toast.view.*
import kotlinx.android.synthetic.main.nx_motion_base_toast.view.*


class NXColorToast {
    companion object {
        const val SHORT_DURATION = Toast.LENGTH_SHORT
        const val LONG_DURATION = Toast.LENGTH_LONG
        const val TOAST_SUCCESS = "SUCCESS"
        const val TOAST_ERROR = "FAILED"
        const val TOAST_WARNING = "WARNING"
        const val TOAST_INFO = "INFO"
        const val TOAST_DELETE = "DELETE"
        const val TOAST_NO_INTERNET = "NO INTERNET"


        const val GRAVITY_TOP = Gravity.TOP
        const val GRAVITY_CENTER = Gravity.CENTER
        const val GRAVITY_BOTTOM = Gravity.BOTTOM

        private lateinit var layoutInflater: LayoutInflater

        private fun createToastMethod(
            context: Activity,
            message: String,
            style: String,
            position: Int,
            duration: Int
        ) {
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(
                R.layout.motion_toast,
                (context).findViewById(R.id.motion_toast_view)
            )
            when (style) {
                // Function for Toast Success
                TOAST_SUCCESS -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_check_green
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)

                    // Background tint color for side view

                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.success_color
                    ))
                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.success_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.success_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_SUCCESS
                    layout.custom_toast_description.setTextColor(Color.BLACK)
                    layout.custom_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.duration = duration
                    toast.show()
                }
                // CTA for Toast Error
                TOAST_ERROR -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_error_
                        )
                    )
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)

                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.error_color
                    ))
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.error_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.error_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_ERROR
                    layout.custom_toast_description.setTextColor(Color.BLACK)
                    layout.custom_toast_description.text = message

                    val toast = Toast(context.applicationContext)

                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
                    toast.duration = duration
                    toast.show()
                }
                // CTA for Toast Warning
                TOAST_WARNING -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_warning_yellow
                        )
                    )
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)

                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.warning_color
                    ))
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.warning_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.warning_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_WARNING
                    layout.custom_toast_description.setTextColor(Color.BLACK)
                    layout.custom_toast_description.text = message

                    val toast = Toast(context.applicationContext)

                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
                    toast.duration = duration
                    toast.show()
                }
                // CTA for Toast Info
                TOAST_INFO -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_info_blue
                        )
                    )
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)


                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.info_color
                    ))
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.info_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.info_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_INFO
                    layout.custom_toast_description.setTextColor(Color.BLACK)
                    layout.custom_toast_description.text = message

                    val toast = Toast(context.applicationContext)


                    toast.duration = duration
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
                    toast.show()
                }
                // CTA for Toast Delete
                TOAST_DELETE -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_delete_
                        )
                    )


                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)

                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.delete_color
                    ))

                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.delete_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.delete_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_DELETE
                    layout.custom_toast_description.setTextColor(Color.BLACK)
                    layout.custom_toast_description.text = message

                    val toast = Toast(context.applicationContext)
                    toast.duration = duration
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
//                    layout.animate().alpha(0f).duration = 3000
                    toast.show()

                }
                // CTA for Toast No Internet
                TOAST_NO_INTERNET -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_no_internet
                        )
                    )


                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)

                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.warning_color
                    ))
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.warning_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.warning_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_NO_INTERNET
                    layout.custom_toast_description.setTextColor(Color.BLACK)
                    layout.custom_toast_description.text = message

                    val toast = Toast(context.applicationContext)
                    toast.duration = duration
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
//                    layout.animate().alpha(0f).duration = 3000
                    toast.show()

                }


            }

        }

        // all toast CTA
        fun createToast(
            context: Activity,
            message: String,
            style: String,
            position: Int,
            duration: Int
        ) {
            if ("main" == Thread.currentThread().name.toLowerCase()) {
                createToastMethod(context, message, style, position, duration)
            } else {
                context.runOnUiThread {
                    createToastMethod(context, message, style, position, duration)
                }
            }

        }

        fun NXCreateToast(
            context: Activity,
            message: String,
            style: String,
            position: Int,
            duration: Int
        ) {
            if ("main" == Thread.currentThread().name.toLowerCase()) {
                nxCreateToast(context, message, style, position, duration)
            } else {
                context.runOnUiThread {
                    nxCreateToast(context, message, style, position, duration)
                }
            }


        }
        private fun nxCreateToast(  context: Activity,
                                    message: String,
                                    style: String,
                                    position: Int,
                                    duration: Int){
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(
                R.layout.nx_motion_base_toast,
                (context).findViewById(R.id.motion_toast_views)
            )
            when (style) {
                // Function for Toast Success
                TOAST_SUCCESS -> {

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background2
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.nx_success_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.custom_toast_descriptiona.setTextColor(Color.WHITE)
                    layout.custom_toast_descriptiona.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration

                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.duration = duration
                    toast.show()
                }
                // CTA for Toast Error
                TOAST_ERROR -> {

                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background2
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.nx_error_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable

                    layout.custom_toast_descriptiona.setTextColor(Color.WHITE)
                    layout.custom_toast_descriptiona.text = message

                    val toast = Toast(context.applicationContext)

                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
                    toast.duration = duration
                    toast.show()
                }
                // CTA for Toast Warning
                TOAST_WARNING -> {

                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background2
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.nx_warning_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    layout.custom_toast_descriptiona.setTextColor(Color.WHITE)
                    layout.custom_toast_descriptiona.text = message

                    val toast = Toast(context.applicationContext)

                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
                    toast.duration = duration
                    toast.show()
                }
                // CTA for Toast Info
                TOAST_INFO -> {

                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background2
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.nx_info_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable

                    layout.custom_toast_descriptiona.setTextColor(Color.WHITE)
                    layout.custom_toast_descriptiona.text = message

                    val toast = Toast(context.applicationContext)
                    toast.duration = duration
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
                    toast.show()
                }
                // CTA for Toast Delete
                TOAST_DELETE -> {

                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background2
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.nx_delete_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable

                    layout.custom_toast_descriptiona.setTextColor(Color.WHITE)
                    layout.custom_toast_descriptiona.text = message

                    val toast = Toast(context.applicationContext)
                    toast.duration = duration
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
//                    layout.animate().alpha(0f).duration = 3000
                    toast.show()

                }
                // CTA for Toast No Internet
                TOAST_NO_INTERNET -> {

                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background2
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.nx_warning_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable

                    layout.custom_toast_descriptiona.setTextColor(Color.WHITE)
                    layout.custom_toast_descriptiona.text = message

                    val toast = Toast(context.applicationContext)
                    toast.duration = duration
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
//                    layout.animate().alpha(0f).duration = 3000
                    toast.show()

                }


            }
        }

        fun nxCustomeToast( context: Activity,
                            message: String,
                            position: Int = GRAVITY_BOTTOM,
                            duration: Int = SHORT_DURATION,
                            @ColorRes bgColor: Int = R.color.delete_bg_color,
                            @ColorRes textColor: Int = R.color.dark_bg_color){
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(
                R.layout.nx_motion_base_toast,
                (context).findViewById(R.id.motion_toast_views)
            )

            val drawable =
                ContextCompat.getDrawable(
                    context,
                    R.drawable.toast_round_background2
                )
            drawable?.colorFilter = PorterDuffColorFilter(
                ContextCompat.getColor(context, bgColor),
                PorterDuff.Mode.MULTIPLY
            )

            layout.background = drawable


            layout.custom_toast_descriptiona.setTextColor(
                ContextCompat.getColor(
                    context,
                    textColor
                )
            )
            layout.custom_toast_descriptiona.text = message


            // init toast
            val toast = Toast(context.applicationContext)

            //   Setting up the duration

            // Setting Toast Gravity
            if (position == GRAVITY_BOTTOM) {
                toast.setGravity(position, 0, 100)
            } else if (position == GRAVITY_CENTER) {

                toast.setGravity(position, 0, 10)

            } else {
                toast.setGravity(position, 0, 200)
            }

            // Setting layout to toast
            toast.view = layout
            toast.duration = duration
            toast.show()

        }

        fun NXCustomToast(
            context: Activity,
            message: String,
            position: Int = GRAVITY_BOTTOM,
            duration: Int = SHORT_DURATION,
            @ColorRes bgColor: Int =  R.color.default_color,
            @ColorRes textColor: Int = android.R.color.black
        ) {
            if ("main" == Thread.currentThread().name.toLowerCase()) {
                nxCustomeToast(context,message,position,duration,bgColor,textColor)
            } else {
                context.runOnUiThread {
                    nxCustomeToast(context,message,position,duration,bgColor,textColor)
                }
            }

        }

        // all color toast CTA
        fun createColorToast(
            context: Activity,
            message: String,
            style: String,
            position: Int,
            duration: Int

        ) {
            if ("main" == Thread.currentThread().name.toLowerCase()) {
                createColorToastMethod(context,message,style,position,duration)
            } else {
                context.runOnUiThread {
                    createColorToastMethod(context,message,style,position,duration)
                }
            }
        }
        private fun createColorToastMethod(   context: Activity,
                                        message: String,
                                        style: String,
                                        position: Int,
                                        duration: Int){
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(
                R.layout.full_color_toast,
                (context).findViewById(R.id.color_toast_view)
            )
            when (style) {
                // Function for Toast Success
                TOAST_SUCCESS -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_check_green
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.success_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.color_toast_text.setTextColor(Color.WHITE)
                    layout.color_toast_text.text =
                        TOAST_SUCCESS
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration

                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                // CTA for Toast Error
                TOAST_ERROR -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_error_
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.error_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.color_toast_text.setTextColor(Color.WHITE)
                    layout.color_toast_text.text =
                        TOAST_ERROR
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration
                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                // CTA for Toast Warning
                TOAST_WARNING -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_warning_yellow
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.warning_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.color_toast_text.setTextColor(Color.WHITE)
                    layout.color_toast_text.text =
                        TOAST_WARNING
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration

                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                // CTA for Toast Info
                TOAST_INFO -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_info_blue
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.info_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.color_toast_text.setTextColor(Color.WHITE)
                    layout.color_toast_text.text =
                        TOAST_INFO
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration

                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                // CTA for Toast Delete
                TOAST_DELETE -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_delete_
                        )
                    )


                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.delete_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.color_toast_text.setTextColor(Color.WHITE)
                    layout.color_toast_text.text =
                        TOAST_DELETE
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration

                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()

                }
                // CTA for Toast No Internet
                TOAST_NO_INTERNET -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_no_internet
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.warning_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.color_toast_text.setTextColor(Color.WHITE)
                    layout.color_toast_text.text =
                        TOAST_NO_INTERNET
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration

                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
            }
        }


        // all dark toast CTA
        fun darkToast(
            context: Activity,
            message: String,
            style: String,
            position: Int,
            duration: Int

        ) {
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(
                R.layout.full_color_toast,
                (context).findViewById(R.id.color_toast_view)
            )
            when (style) {
                // Function for Toast Success
                TOAST_SUCCESS -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_check_green
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable


                    layout.color_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.success_title_color
                        )
                    )
                    layout.color_toast_text.text =
                        TOAST_SUCCESS
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration

                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                // CTA for Toast Error
                TOAST_ERROR -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_error_
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.color_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.error_color
                        )
                    )
                    layout.color_toast_text.text =
                        TOAST_ERROR
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration
                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                // CTA for Toast Warning
                TOAST_WARNING -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_warning_yellow
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.color_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.warning_color
                        )
                    )
                    layout.color_toast_text.text =
                        TOAST_WARNING
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration
                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                // CTA for Toast Info
                TOAST_INFO -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_info_blue
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.color_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.info_color
                        )
                    )
                    layout.color_toast_text.text =
                        TOAST_INFO
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration

                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                // CTA for Toast Delete
                TOAST_DELETE -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_delete_
                        )
                    )


                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.color_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.delete_color
                        )
                    )
                    layout.color_toast_text.text =
                        TOAST_DELETE
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration

                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()

                }
                // CTA for Toast No Internet
                TOAST_NO_INTERNET -> {
                    layout.color_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_no_internet
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.color_toast_image.startAnimation(pulseAnimation)

                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.color_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.warning_color
                        )
                    )
                    layout.color_toast_text.text =
                        TOAST_NO_INTERNET
                    layout.color_toast_description.setTextColor(Color.WHITE)
                    layout.color_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration

                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()

                }


            }

        }


        // all toast CTA
        fun darkColorToast(
            context: Activity,
            message: String,
            style: String,
            position: Int,
            duration: Int

        ) {
            layoutInflater = LayoutInflater.from(context)
            val layout = layoutInflater.inflate(
                R.layout.motion_toast,
                (context).findViewById(R.id.motion_toast_view)
            )
            when (style) {
                // Function for Toast Success
                TOAST_SUCCESS -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_check_green
                        )
                    )

                    // Pulse Animation for Icon
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)

                    // Background tint color for side view


                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.success_color
                    ))
                    // round background color
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable

                    // Setting up the color for title & Message text
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.success_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_SUCCESS
                    layout.custom_toast_description.setTextColor(Color.WHITE)
                    layout.custom_toast_description.text = message


                    // init toast
                    val toast = Toast(context.applicationContext)

                    //   Setting up the duration
                    toast.duration = duration
                    // Setting Toast Gravity
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }

                    // Setting layout to toast
                    toast.view = layout
                    toast.show()
                }
                // CTA for Toast Error
                TOAST_ERROR -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_error_
                        )
                    )
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)

                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.error_color
                    ))
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.error_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_ERROR
                    layout.custom_toast_description.setTextColor(Color.WHITE)
                    layout.custom_toast_description.text = message

                    val toast = Toast(context.applicationContext)
                    toast.duration = duration

                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
                    toast.show()
                }
                // CTA for Toast Warning
                TOAST_WARNING -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_warning_yellow
                        )
                    )
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)

                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.warning_color
                    ))
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )

                    layout.background = drawable
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.warning_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_WARNING
                    layout.custom_toast_description.setTextColor(Color.WHITE)
                    layout.custom_toast_description.text = message

                    val toast = Toast(context.applicationContext)
                    toast.duration = duration

                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
                    toast.show()
                }
                // CTA for Toast Info
                TOAST_INFO -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_info_blue
                        )
                    )
                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)


                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.info_color
                    ))
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.info_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_INFO
                    layout.custom_toast_description.setTextColor(Color.WHITE)
                    layout.custom_toast_description.text = message

                    val toast = Toast(context.applicationContext)
                    toast.duration = duration
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
                    toast.show()
                }
                // CTA for Toast Delete
                TOAST_DELETE -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_delete_
                        )
                    )


                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)


                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.delete_color
                    ))
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.delete_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_DELETE
                    layout.custom_toast_description.setTextColor(Color.WHITE)
                    layout.custom_toast_description.text = message

                    val toast = Toast(context.applicationContext)
                    toast.duration = duration
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
//                    layout.animate().alpha(0f).duration = 3000
                    toast.show()

                }
                // CTA for Toast No Internet
                TOAST_NO_INTERNET -> {
                    layout.custom_toast_image.setImageDrawable(
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.ic_no_internet
                        )
                    )


                    val pulseAnimation = AnimationUtils.loadAnimation(
                        context,
                        R.anim.pulse
                    )
                    layout.custom_toast_image.startAnimation(pulseAnimation)


                    ViewCompat.setBackgroundTintList(layout.colorView, ContextCompat.getColorStateList(
                        context,
                        R.color.warning_color
                    ))
                    val drawable =
                        ContextCompat.getDrawable(
                            context,
                            R.drawable.toast_round_background
                        )
                    drawable?.colorFilter = PorterDuffColorFilter(
                        ContextCompat.getColor(
                            context,
                            R.color.dark_bg_color
                        ),
                        PorterDuff.Mode.MULTIPLY
                    )
                    layout.background = drawable
                    layout.custom_toast_text.setTextColor(
                        ContextCompat.getColor(
                            context,
                            R.color.warning_color
                        )
                    )
                    layout.custom_toast_text.text =
                        TOAST_NO_INTERNET
                    layout.custom_toast_description.setTextColor(Color.WHITE)
                    layout.custom_toast_description.text = message

                    val toast = Toast(context.applicationContext)
                    toast.duration = duration
                    if (position == GRAVITY_BOTTOM) {
                        toast.setGravity(position, 0, 100)
                    } else {
                        toast.setGravity(position, 0, 0)
                    }
                    toast.view = layout//setting the view of custom toast layout
//                    layout.animate().alpha(0f).duration = 3000
                    toast.show()
                }
            }
        }
    }
}