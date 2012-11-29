package capstone;

import java.util.ArrayList;

import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class SessionBean
 */
@Singleton
@LocalBean
public class SessionBean {

	ArrayList<User> loggedUsers;

	/**
	 * Default constructor.
	 */
	public SessionBean() {
		loggedUsers = new ArrayList<User>();

	}

	@Lock(LockType.READ)
	public ArrayList<User> getLoggedUsers() {
		return loggedUsers;
	}

}
