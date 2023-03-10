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

class FlyingMonster extends Monster {
    fly() {
        console.log(`${this.name} flew`);
    }
}

class SwimmingMonster extends Monster {
    swim() {
        console.log(`${this.name} swam`);
    }
}

// class to implement both flying and swimming
class FlyingSwimmingMonster extends Monster{
    // problematic, inherit either flyingmonster or swimmingmonster class and then define swim or fly function
}


const bear = new Monster('bear')
bear.walk() 
bear. attack() 

const eagle = new FlyingMonster('eagle')
eagle.walk() 
eagle.attack() 
eagle.fly()

const shark = new SwimmingMonster('shark')
shark.walk() 
shark.attack()
shark. swim()