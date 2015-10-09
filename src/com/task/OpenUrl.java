package com.task;

import java.awt.Desktop;
import java.net.URL;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean
@SessionScoped
public class OpenUrl {

	public void shin() {
		OpenUrl browse = new OpenUrl();
		browse.CallUrl("http://teststore.iqsolutions.com/home");
	}

	public void nhlbi() {
		OpenUrl browse = new OpenUrl();
		browse.CallUrl("http://testnhlbi.iqsolutions.com/catalog/home");
	}

	public void ninds() {
		OpenUrl browse = new OpenUrl();
		browse.CallUrl("http://testninds.iqsolutions.com/ninds/home");
	}

	public void nimh() {
		OpenUrl browse = new OpenUrl();
		browse.CallUrl("http://testnimh.iqsolutions.com/");
	}

	public void CallUrl(String url) {
		try {
		//System.out.println("Test1");
			Desktop.getDesktop().browse(new URL(url).toURI());
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
