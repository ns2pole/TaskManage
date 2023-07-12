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
    ('task2', '2023-07-02', 45, 40, 2),
    ('task3', '2023-07-03', 45, 40, 2);
