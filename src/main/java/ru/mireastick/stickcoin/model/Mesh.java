package ru.mireastick.stickcoin.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Setter
@Getter
@AllArgsConstructor
public class Mesh {

    List<Node> nodes ;

    public Mesh() {
        nodes = new ArrayList<>();
    }

    public void registerNode(Node node) {
        nodes.add(node);
    }
}
