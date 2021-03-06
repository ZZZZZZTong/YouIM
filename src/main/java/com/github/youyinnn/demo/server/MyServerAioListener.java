package com.github.youyinnn.demo.server;

import com.github.youyinnn.server.tcp.AbstractServerAioListener;
import org.tio.core.ChannelContext;
import org.tio.core.intf.Packet;

/**
 * @author youyinnn
 */
public class MyServerAioListener extends AbstractServerAioListener {

    @Override
    public void afterClosed(ChannelContext channelContext, Throwable throwable, String remark, boolean isRemove) throws Exception {
        //System.out.println("onAfterClose channelContext:" + channelContext +
        //        ", throwable:" + throwable +
        //        ", remark:" + remark +
        //        ", isRemove:" +  isRemove);
    }


    @Override
    public void afterConnected(ChannelContext channelContext, boolean isConnected, boolean isReconnect) throws Exception {
        //System.out.println("onAfterConnected channelContext:" + channelContext +
        //        ", isConnected:" + isConnected +
        //        ", isReconnect:" + isReconnect);
    }

    @Override
    public void onAfterReceived(ChannelContext channelContext, Packet packet, int packetSize) throws Exception {
        //System.out.println("onAfterReceived channelContext:" + channelContext +
        //        ", packets:" + packets +
        //        ", packetSize:" + packetSize);
    }

    @Override
    public void onAfterSent(ChannelContext channelContext, Packet packet, boolean isSentSuccess) throws Exception {
        //System.out.println("onAfterSent channelContext:" + channelContext +
        //        ", packets:" + packets +
        //        ", isSentSuccess:" + isSentSuccess);
    }

    @Override
    public void onBeforeClose(ChannelContext channelContext, Throwable throwable, String remark, boolean isRemove) {

    }
}
