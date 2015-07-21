INSERT INTO cw_admin.txn_type (UID, TXN_NAME, TXN_CODE, DESCRIPTION, CREATED_TIMESTAMP, UPDATED_TIMESTAMP) VALUES(1, 'Activation', 'ACTVN', 'Card Selling & Activation', now(), now());
INSERT INTO cw_admin.txn_type (UID, TXN_NAME, TXN_CODE, DESCRIPTION, CREATED_TIMESTAMP, UPDATED_TIMESTAMP) VALUES(2, 'Sale', 'REDEEM', 'Sale Transaction', now(), now());
INSERT INTO cw_admin.txn_type (UID, TXN_NAME, TXN_CODE, DESCRIPTION, CREATED_TIMESTAMP, UPDATED_TIMESTAMP) VALUES(3, 'Reload', 'RELOAD', 'Card Reload', now(), now());
INSERT INTO cw_admin.txn_type (UID, TXN_NAME, TXN_CODE, DESCRIPTION, CREATED_TIMESTAMP, UPDATED_TIMESTAMP) VALUES(4, 'Balance Inquiry', 'BALIQ', 'Balance Inquiry', now(), now());

INSERT INTO cw_admin.users (UID, FIRST_NAME, LAST_NAME, ADDRESS, CITY, PIN, STATE, COUNTRY, PHONE, EMAIL, STATUS, CREATED_TIMESTAMP, UPDATED_TIMESTAMP)VALUES(1, 'Manoj', 'Singh', '', '', '', '', '', '', '', 0, now(), now());
INSERT INTO cw_admin.user_login (UID, USER_NAME, PASSWORD, USER_TYPE, USER_ID, STATUS, CREATED_TIMESTAMP, UPDATED_TIMESTAMP)VALUES(1, 'manoj', 'pass', 'admin', 1, 0, now(), now());

