CREATE TABLE ElectronicsStore (
                                  id SERIAL PRIMARY KEY,
                                  name VARCHAR(255) NOT NULL,
                                  address VARCHAR(255) NOT NULL,
                                  working_hours VARCHAR(255) NOT NULL,
                                  contact_number VARCHAR(255) NOT NULL,
                                  manager_name VARCHAR(255) NOT NULL
);