package com.lykj.scm.common.utils;

import java.io.Closeable;
import java.io.IOException;

/** 
 * @version:v1.0.0
 * @Description:(IO相关工具类)
 * @author:shilei
 * @date:2020年6月9日 下午1:35:51
 */
public class IOUtils {

	/**
	 * 关闭对象，连接
	 * @param closeable
	 */
    public static void closeQuietly(final Closeable closeable) {
        try {
            if (closeable != null) {
                closeable.close();
            }
        } catch (final IOException ioe) {
            // ignore
        }
    }
}
