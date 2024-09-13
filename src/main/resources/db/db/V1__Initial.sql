DROP TABLE IF EXISTS "xuser";
CREATE TABLE "xuser"(
    id BIGINT PRIMARY KEY,
    username VARCHAR(255)
);

DROP TABLE IF EXISTS tweet;
CREATE TABLE tweet(
    id BIGINT PRIMARY KEY,
    tweets TEXT,
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES "xuser" (id)
);