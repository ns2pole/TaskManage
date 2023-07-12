## postgresログイン
psql -U nakamura -d postgres
## OWNER変更
ALTER TABLE tasks OWNER TO nakamura;
## PASSWORD変更
ALTER USER nakamura WITH PASSWORD 'password2';