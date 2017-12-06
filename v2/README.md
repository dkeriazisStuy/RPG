# RPG

## class _Character_
### Fields
- int _health_
- int _strength_
- int _defense_
- double _attack_

### Methods
- boolean *isAlive*
- int _getDefense_
- void _lowerHP_
    - int _amount_
- int attack
    - Character _c_

## class _Protagonist_ extends _Character_
### Fields
- String _name_
- int _start_defense_
- double _start_attack_

### Constructors
- Protagonist
    - String _name_

### Methods
- String _toString_
- String _getName_
- void _specialize_
- void _normalize_

## class _Monster_
### Constructors
- Monster

### Methods
- int _randInt_
    - int _a_
    - int _b_
- String _toString_
