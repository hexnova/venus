/**
 * 
 */
package com.meidusa.venus.exception;

import com.meidusa.venus.annotations.RemoteException;

/**
 * 
 * 
 * @author Sun Ning
 * @since 2010-3-4
 */
@RemoteException(errorCode=VenusExceptionCodeConstant.REQUEST_ILLEGAL)
public class InvalidRequestException extends AbstractVenusException {
    private static final long serialVersionUID = -1583661559860123414L;

    public InvalidRequestException(String msg) {
        super("InvalidParameterException:" + msg);
    }

    public int getErrorCode() {
        return VenusExceptionCodeConstant.REQUEST_ILLEGAL;
    }

}
