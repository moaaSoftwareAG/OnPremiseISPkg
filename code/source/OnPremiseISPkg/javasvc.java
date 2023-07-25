package OnPremiseISPkg;

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import java.util.Random;
// --- <<IS-END-IMPORTS>> ---

public final class javasvc

{
	// ---( internal utility methods )---

	final static javasvc _instance = new javasvc();

	static javasvc _newInstance() { return new javasvc(); }

	static javasvc _cast(Object o) { return (javasvc)o; }

	// ---( server methods )---




	public static final void calculateUUID (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(calculateUUID)>> ---
		// @sigtype java 3.5
		// [o] field:0:required outRandomNum
		 Random rand = new Random();
		 int randomNum = rand.nextInt(10000);
		 String outRandomNum=""+randomNum;
		 
		// pipeline
		 IDataCursor pipelineCursor = pipeline.getCursor();
		 IDataUtil.put( pipelineCursor, "outRandomNum", outRandomNum);
		 pipelineCursor.destroy();
		 
		// --- <<IS-END>> ---

                
	}
}

