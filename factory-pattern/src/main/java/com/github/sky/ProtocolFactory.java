package com.github.sky;

/**
 * 协议工厂
 */
public class ProtocolFactory {

    private final static ProtocolFactory factory = new ProtocolFactory();

    private ProtocolFactory() {

    }

    public static ProtocolFactory getFactory(){
        return factory;
    }

    public Protocol getProtocol(ProtocolEnum protocolName){
        if(protocolName.equals(ProtocolEnum.HTTP)){
            return new HttpProtocol();
        }else if(protocolName.equals(ProtocolEnum.FTP)){
            return new FtpProtocol();
        }else if(protocolName.equals(ProtocolEnum.TCP)){
            return new TcpProtocol();
        }else {
            throw new RuntimeException("不支持的协议");
        }
    }
}
