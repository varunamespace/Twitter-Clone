DROP TABLE IF EXISTS "xuser" CASCADE;
DROP TABLE IF EXISTS "users" CASCADE;
CREATE TABLE "users"(
    id BIGINT PRIMARY KEY,
    username VARCHAR(255)
);

DROP TABLE IF EXISTS tweet;
CREATE TABLE tweet(
    id BIGINT PRIMARY KEY,
    tweets TEXT,
    user_id BIGINT,
    FOREIGN KEY (user_id) REFERENCES "users" (id)
);