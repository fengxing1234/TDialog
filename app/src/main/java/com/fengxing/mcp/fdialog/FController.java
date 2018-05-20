package com.fengxing.mcp.fdialog;import android.graphics.Canvas;import android.graphics.drawable.Drawable;import android.graphics.drawable.RippleDrawable;import android.view.View;/** * Created by fengxing on 2018/5/10. */public class FController {    private int resLayout;    private View view;    private int gravity;    private boolean isCancelable;    private boolean isCancelOutside;    private Drawable backGroundDrawable;    private float alpha;    private float dimAmount;    private float width;    private float height;    private int x;    public int y;    public int animationStyle;    private int[] resIds;    public OnViewClickListener onViewClickListener;    public OnBindViewListener onBindViewListener;    public int getResLayout() {        return resLayout;    }    public OnViewClickListener getOnViewClickListener() {        return onViewClickListener;    }    public void setResLayout(int resLayout) {        this.resLayout = resLayout;    }    public View getView() {        return view;    }    public void setView(View view) {        this.view = view;    }    public int getGravity() {        return gravity;    }    public void setGravity(int gravity) {        this.gravity = gravity;    }    public boolean isCancelable() {        return isCancelable;    }    public void setCancelable(boolean cancelable) {        isCancelable = cancelable;    }    public boolean isCancelOutside() {        return isCancelOutside;    }    public void setCancelOutside(boolean cancelOutside) {        isCancelOutside = cancelOutside;    }    public Drawable getBackGroundDrawable() {        return backGroundDrawable;    }    public void setBackGroundDrawable(Drawable backGroundDrawable) {        this.backGroundDrawable = backGroundDrawable;    }    public float getAlpha() {        return alpha;    }    public void setAlpha(float alpha) {        this.alpha = alpha;    }    public float getDimAmount() {        return dimAmount;    }    public void setDimAmount(float dimAmount) {        this.dimAmount = dimAmount;    }    public float getWidth() {        return width;    }    public void setWidth(float width) {        this.width = width;    }    public float getHeight() {        return height;    }    public void setHeight(float height) {        this.height = height;    }    public int getX() {        return x;    }    public void setX(int x) {        this.x = x;    }    public int getY() {        return y;    }    public void setY(int y) {        this.y = y;    }    public int getAnimationStyle() {        return animationStyle;    }    public void setAnimationStyle(int animationStyle) {        this.animationStyle = animationStyle;    }    public static FController create() {        return new FController();    }    public int[] getResIds() {        return resIds;    }    public static class Params {        public int resLayout;        public View view;        public int gravity;        public boolean isCancelable = true;        public boolean isCancelOutside = true;        public Drawable backGroundDrawable;        public float alpha = 1.0f;        public float dimAmount = -1;        public float width;        public float height;        public int x;        public int y;        public int animationStyle;        public int[] resIds;        public OnViewClickListener onViewClickListener;        public OnBindViewListener onBindViewListener;        public void apply(FController controller) {            controller.setResLayout(resLayout);            controller.setView(view);            controller.setGravity(gravity);            controller.setCancelable(isCancelable);            controller.setCancelOutside(isCancelOutside);            if (backGroundDrawable != null) {                controller.setBackGroundDrawable(backGroundDrawable);            }            controller.setAlpha(alpha);            controller.setDimAmount(dimAmount);            controller.setWidth(width);            controller.setHeight(height);            controller.setX(x);            controller.setY(y);            controller.setAnimationStyle(animationStyle);            if (resIds != null && resIds.length > 0) {                controller.resIds = resIds;            }            if (onViewClickListener != null) {                controller.onViewClickListener = onViewClickListener;            }            controller.onBindViewListener = onBindViewListener;        }    }}