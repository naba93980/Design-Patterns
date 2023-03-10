// ---------------------------inheritance-----------------------------------
class Monster {
    constructor(name) {
        this.name = name;
    }
    attack() {
        console.log(`${this.name} attacked`);
    }
    walk() {
        console.log(`${this.name} walk`);
    }
}

class SwimmingMonster extends Monster {
    constructor(name) {
        super(name);
    }
    swim() {
        console.log(`${this.name} swam`);
    }
}

class FlyingMonster extends Monster {
    constructor(name) {
        super(name);
    }
    fly() {
        console.log(`${this.name} flew`);
    }
}

/*
const bear = new Monster('bear')
bear.walk()
bear.attack()

const eagle = new FlyingMonster('eagle')
eagle.walk()
eagle.attack()
eagle.fly()

const shark = new SwimmingMonster('shark')
shark.walk()
shark.attack()
shark.swim()
 */

// ----------------------------------------composition----------------------------------------- //

// kind of main monster class
function monster({ name }) {
    return {
        name,
        attack: () => console.log(`${name} attacked`),
        walk: () => console.log(`${name} walk`),
    }
}

// kind of object of main monster class injected to swimmerMonster swimmerMonster class constructor
function swimmerMonster(monster) {
    return {
        ...monster,
        swim: () => console.log(`${monster.name} swam`)
    }
}

function flyingMonster(monster) {
    return {
        ...monster,
        fly: () => console.log(`${monster.name} fly`)
    }
}

function swimmerFlyingMonster(monster) {
    return {
        ...monster,
        swim: swimmerMonster(monster).swim,
        fly: flyingMonster(monster).fly
    }
}

// const bear = monster({ name: 'bear' });
// bear.attack();
// bear.walk();

// const shark = swimmerMonster(monster({ name: 'shark' }));
// shark.attack();
// shark.walk();
// shark.swim();

const eagleShark = swimmerFlyingMonster(monster({ name: 'eagleShark' }));
eagleShark.attack();
eagleShark.walk();
eagleShark.fly();
eagleShark.swim();
