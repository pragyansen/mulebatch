package flow;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class ShowError implements Callable {

	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		eventContext.getMessage().setInvocationProperty("http.request", "/error.html");
		eventContext.getMessage().setInvocationProperty("http.request.path", "/error.html");
		eventContext.getMessage().setInvocationProperty("http.relative.path", "error.html");
		return eventContext.getMessage().getPayload();
	}

}
