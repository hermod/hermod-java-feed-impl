package com.github.hermod.feed.server.impl;

import com.github.hermod.feed.Status;
import com.github.hermod.feed.server.Publisher;
import com.github.hermod.ser.intmap.WriteIntMapMsg;

/**
 * HermodPublisher.
 * 
 * @author anavarro - Nov 28, 2012
 * 
 */
public class HermodPublisher
    implements Publisher
{
    
    /**
     * (non-Javadoc)
     * 
     * @see com.github.hermod.feed.server.Publisher#publishMsg(java.lang.String, com.github.hermod.ser.intmap.WriteIntMapMsg)
     */
    @Override
    public boolean publishMsg(String subject, WriteIntMapMsg writeIntMapMsg)
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    /**
     * (non-Javadoc)
     * 
     * @see com.github.hermod.feed.server.Publisher#publishPartialMsg(java.lang.String, com.github.hermod.ser.intmap.WriteIntMapMsg)
     */
    @Override
    public boolean publishPartialMsg(String subject, WriteIntMapMsg writeIntMapMsg)
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    /**
     * (non-Javadoc)
     * 
     * @see com.github.hermod.feed.server.Publisher#setStatus(java.lang.String, com.github.hermod.feed.Status)
     */
    @Override
    public boolean setStatus(String subject, Status status)
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    /**
     * (non-Javadoc)
     * 
     * @see com.github.hermod.feed.server.Publisher#start()
     */
    @Override
    public boolean start()
    {
        // TODO Auto-generated method stub
        return false;
    }
    
    /**
     * (non-Javadoc)
     * 
     * @see com.github.hermod.feed.server.Publisher#stop()
     */
    @Override
    public boolean stop()
    {
        // TODO Auto-generated method stub
        return false;
    }
    
}
