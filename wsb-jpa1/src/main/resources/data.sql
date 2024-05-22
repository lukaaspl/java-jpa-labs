-- sample addresses
INSERT INTO
    ADDRESS (
        ID,
        CITY,
        ADDRESS_LINE1,
        POSTAL_CODE
    )
VALUES (
        1,
        'Wrocław',
        'Pl. Grunwaldzki 44',
        '50-301'
    );

INSERT INTO
    ADDRESS (
        ID,
        CITY,
        ADDRESS_LINE1,
        POSTAL_CODE
    )
VALUES (
        2,
        'Wrocław',
        'Kochanowskiego 33/2',
        '51-015'
    );

-- sample doctor
INSERT INTO
    DOCTOR (
        ID,
        FIRST_NAME,
        LAST_NAME,
        TELEPHONE_NUMBER,
        EMAIL,
        DOCTOR_NUMBER,
        SPECIALIZATION
    )
VALUES (
        1,
        'Jan',
        'Kowalski',
        '123456789',
        'jan.kowalski@example.com',
        '223344556',
        'SURGEON'
    );

INSERT INTO DOCTOR_ADDRESS (DOCTOR_ID, ADDRESS_ID) VALUES (1, 1);

-- sample patient
INSERT INTO
    PATIENT (
        ID,
        DATE_OF_BIRTH,
        EMAIL,
        FIRST_NAME,
        LAST_NAME,
        PATIENT_NUMBER,
        TELEPHONE_NUMBER
    )
VALUES (
        1,
        DATE '1990-01-01',
        'adam.nowak@example.com',
        'Adam',
        'Nowak',
        '313412250',
        '902313541'
    );

INSERT INTO PATIENT_ADDRESS (PATIENT_ID, ADDRESS_ID) VALUES (1, 2);

-- sample visit
INSERT INTO
    VISIT (
        ID,
        DESCRIPTION,
        TIME,
        DOCTOR_ID,
        PATIENT_ID
    )
VALUES (
        1,
        'Lorem ipsum dolor sit amet',
        TIMESTAMP '2021-01-01 12:00:00',
        1,
        1
    );

-- sample treatments

INSERT INTO
    MEDICAL_TREATMENT (
        ID,
        DESCRIPTION,
        TYPE,
        VISIT_ID
    )
VALUES (
        1,
        'Praesent vitae nisl non turpis luctus fringilla',
        'RTG',
        1
    );

INSERT INTO
    MEDICAL_TREATMENT (
        ID,
        DESCRIPTION,
        TYPE,
        VISIT_ID
    )
VALUES (
        2,
        'Nullam sit amet nunc nec nunc',
        'USG',
        1
    );