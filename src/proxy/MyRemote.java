package proxy;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @Author: EdenChanIy
 * @Date: 2019/7/24 10:56
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
