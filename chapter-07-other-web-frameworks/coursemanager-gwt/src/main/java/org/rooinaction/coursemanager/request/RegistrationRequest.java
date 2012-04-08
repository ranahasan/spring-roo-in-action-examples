// WARNING: THIS FILE IS MANAGED BY SPRING ROO.

package org.rooinaction.coursemanager.request;

import com.google.web.bindery.requestfactory.shared.InstanceRequest;
import com.google.web.bindery.requestfactory.shared.Request;
import com.google.web.bindery.requestfactory.shared.RequestContext;
import com.google.web.bindery.requestfactory.shared.ServiceName;
import org.springframework.roo.addon.gwt.RooGwtRequest;

@RooGwtRequest("org.rooinaction.coursemanager.shared.model.Registration")
@ServiceName("org.rooinaction.coursemanager.shared.model.Registration")
public interface RegistrationRequest extends RequestContext {

    abstract Request<java.lang.Long> countRegistrations();

    abstract Request<java.util.List<org.rooinaction.coursemanager.proxy.RegistrationProxy>> findAllRegistrations();

    abstract Request<java.util.List<org.rooinaction.coursemanager.proxy.RegistrationProxy>> findRegistrationEntries(int firstResult, int maxResults);

    abstract Request<org.rooinaction.coursemanager.proxy.RegistrationProxy> findRegistration(Long id);

    abstract InstanceRequest<org.rooinaction.coursemanager.proxy.RegistrationProxy, java.lang.Void> persist();

    abstract InstanceRequest<org.rooinaction.coursemanager.proxy.RegistrationProxy, java.lang.Void> remove();
}