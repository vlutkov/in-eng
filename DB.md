### Card

Fields:
* id `BIGSERIAL`
* eng `TEXT`
* ru `TEXT`
* speech_type_id `TEXT` REFERENCES speech_type (id),
* description `TEXT`
* example `TEXT`
* create_date `TIMESTAMP`
* update_date `TIMESTAMP`

### SPEECH_TYPE

Fields:
* id `BIGSERIAL`
* name `TEXT`
* create_date `TIMESTAMP`
* update_date `TIMESTAMP`