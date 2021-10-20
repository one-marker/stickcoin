package ru.mireastick.stickcoin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Node {

    private String description;

    private String remoteHost;

    private String externalPort;

    private String internalPort;

    private String internalClient;

    private Boolean enabled = true;

}
