alter table CARD_PRODUCT add column EARN_POINT_RULE VARCHAR(20) DEFAULT NULL after CARD_TYPE;
alter table CARD_PRODUCT add column BURN_POINT_RULE VARCHAR(20) DEFAULT NULL after EARN_POINT_RULE;
