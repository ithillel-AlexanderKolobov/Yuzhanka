CREATE TABLE user (id INTEGER PRIMARY KEY, createdAt DATE NOT NULL, createdByUserId INTEGER NOT NULL, email VARCHAR(50) NOT NULL, password VARCHAR(50) NOT NULL, firstName VARCHAR(50), lastName VARCHAR(50) NOT NULL, patronymic VARCHAR(50), dateOfBirdh DATE, passportSerieAndNumber VARCHAR(50), passportWhereAndWhenHanded VARCHAR(50), homeAddress VARCHAR(50), idPayment INTEGER);

