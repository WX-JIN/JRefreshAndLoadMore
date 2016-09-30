package com.ultrapullmore.ptr.loadmore;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * author  liuqi on 16/5/19
 * email   cowboypku@aliyun.com
 * des
 * mark
 */
public class LoadMoreDefaultFooterView  extends LinearLayout implements LoadMoreUIHandler{
 private TextView mTextView;

 public LoadMoreDefaultFooterView(Context context) {
  this(context, null);
 }

 public LoadMoreDefaultFooterView(Context context, AttributeSet attrs) {
  super(context,attrs);
  setupViews();

 }



 private void setupViews() {

 }

 @Override
 public void onLoading(LoadMoreContainer container) {

 }

 @Override
 public void onLoadFinish(LoadMoreContainer container, boolean empty, boolean hasMore) {

 }

 @Override
 public void onWaitToLoadMore(LoadMoreContainer container) {

 }

 @Override
 public void onLoadError(LoadMoreContainer container, int errorCode, String errorMessage) {

 }
}
