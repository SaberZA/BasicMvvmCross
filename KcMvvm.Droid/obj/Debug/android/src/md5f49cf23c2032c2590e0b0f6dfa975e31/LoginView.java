package md5f49cf23c2032c2590e0b0f6dfa975e31;


public class LoginView
	extends md5562ea8ea88bbdf203826d1ab511d79b5.KcActivity_1
	implements
		mono.android.IGCUserPeer
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("KcMvvm.Droid.Views.LoginView, KcMvvm.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", LoginView.class, __md_methods);
	}


	public LoginView () throws java.lang.Throwable
	{
		super ();
		if (getClass () == LoginView.class)
			mono.android.TypeManager.Activate ("KcMvvm.Droid.Views.LoginView, KcMvvm.Droid, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
