## postgresログイン
psql -U nakamura -d postgres  
drop table tasks;
CREATE TABLE tasks (
    id SERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    deadlinedate DATE,
    planminute INTEGER,
    actualminute INTEGER,
    statuscode INTEGER
);

INSERT INTO tasks (name, deadlinedate, planminute, actualminute, statuscode) VALUES
    ('task1', '2023-07-01', 60, 50, 1),
    ('task2', '2023-07-10', 45, 40, 2),
    ('ホーム画面作成', '2023-07-15', 90, 80, 1),
    ('今変更したタスク', '2023-07-20', 120, 100, 3);