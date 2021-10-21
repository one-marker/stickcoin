package ru.mireastick.upnp;

import org.fourthline.cling.UpnpService;
import org.fourthline.cling.UpnpServiceImpl;
import org.fourthline.cling.support.igd.PortMappingListener;
import org.fourthline.cling.support.model.PortMapping;

public class PortOpenService {

    public void openPortUpNp() {

        PortMapping desiredMapping =
                new PortMapping(
                        8123,
                        "192.168.0.197",
                        PortMapping.Protocol.TCP,
                        "My Port Mapping"
                );

        UpnpService upnpService =
                new UpnpServiceImpl(
                        new PortMappingListener(desiredMapping)
                );

        }

}
