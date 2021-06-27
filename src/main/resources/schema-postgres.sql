DROP TABLE IF EXISTS kana;
DROP TABLE IF EXISTS kanji;
CREATE TABLE kana(id serial PRIMARY KEY, kana VARCHAR(3), romaji VARCHAR(3), system VARCHAR(10), level VARCHAR(10), nbLine INTEGER, note VARCHAR(255));
CREATE TABLE kanji(id serial PRIMARY KEY, kanji VARCHAR(10), meaning VARCHAR(255), onYomi VARCHAR(50), kunYomi VARCHAR(50), jlpt VARCHAR(6), radical VARCHAR(10), frequency INTEGER, nbLine INTEGER, note VARCHAR(255));