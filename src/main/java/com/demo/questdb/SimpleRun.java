package com.demo.questdb;

import io.questdb.client.Sender;
import java.time.Instant;

public class SimpleRun {

    public static void main(String[] args) {
        try (Sender sender = Sender.builder()
            .address("localhost")
            .port(9009)
            .build()) {

            sender.table("demo")
                .timestampColumn("timestamp", Instant.now())
                .doubleColumn("value", 42.0)
                .atNow();

        }
    }

}
