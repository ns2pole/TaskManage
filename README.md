## postgresログイン
psql -U nakamura -d postgres
## OWNER変更
ALTER TABLE tasks OWNER TO nakamura;
## PASSWORD変更本番
ALTER USER nakamura WITH PASSWORD 'password1';
## PASSWORD変更テスト用
ALTER USER nakamura WITH PASSWORD 'password2';