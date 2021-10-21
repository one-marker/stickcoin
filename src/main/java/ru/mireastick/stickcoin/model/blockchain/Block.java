package ru.mireastick.stickcoin.model.blockchain;

import com.google.common.hash.Hashing;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.nio.charset.StandardCharsets;
import java.util.Date;

@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Block {

    private Long index;

    private Date timestamp;

    private Transaction transactions;

    private String proof;

    private String previousHash;

    @Override
    public String toString() {
        return "{" +
                "index=" + index +
                ", timestamp=" + timestamp +
                ", transactions='" + transactions + '\'' +
                ", proof='" + proof + '\'' +
                ", previousHash='" + previousHash + '\'' +
                '}';
    }

    public String getSha256hex() {
        String sha256hex = Hashing.sha256()
                .hashString(toString(), StandardCharsets.UTF_8)
                .toString();
        return sha256hex;
    }



}
