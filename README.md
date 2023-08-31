# myHDR
应用技术：Android、Java、MediaCodec编解码框架、OpenGL

项目描述: 此项目基于MediaCodec编解码框架和OpenGL，可以将LDR或SDR视频编辑为HDR视频格式并播放预览；

主要工作：

1.创建SurfaceTexture，SurfaceTexture是Surface与OpenGL ES的结合，SurfaceTexture可以直接BufferQueue拿到数据并渲染；

2.创建 MediaCodec，并拿到SurfaceTexture的Surface；

3.MediCodec解码出的YUV数据，需要在片段着色器赋值之前，把YUV转换成RGB，之后通过OpenGL进行绘制，将原视频的亮度范围和颜色空间进行映射变换，得到HDR标准视频;

4.当第一次回调onDrawFrame时，会调用updateTexture，刷新BufferQueue，待MediaCodec 生产数据时，更新BufferQueue，会重触发onDrawFrame，循环至视频解码结束；

