
package ch.hearc.cours.chatvideo.rmi.specification.specifications;

import java.rmi.Remote;

import javax.imageio.ImageIO;

public interface Application_I extends Remote
	{

	public void setText(String text);
	public void setImage(ImageIO image);
	}
