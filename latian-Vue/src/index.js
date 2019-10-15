var app = new Vue({ 
    el: '#app',
    data: {
        message: 'Hello Vue!'
    }
});

//condition
var app3 = new Vue({
    el: '#app-3',
    data: {
        seen:true
    }
});

//loop
var app4 = new Vue({
    el:'#app-4',
    data:{
        todos:[
            { text : 'Learn Javascript'},
            { text :'learn Vue'},
            { text : 'build something awesome'}
        ]
    }
});


//handling user input
var app5 = new Vue({
    el:'#app-5',
    data:{
        message:'app5. Hello vue.js'
    },
    methods:{
        reverseMessage: function () {
            this.message = this.message.split('').reverse().join('')
        }
    }
});

//binding model
var app6 = new Vue({
    el:"#app-6",
    data:{
        message:'app6. binding model'
    }
});


//complex components
Vue.component('todo-item',{
    props: ['todo'],
    template:'<li>{{todo.text}}</li>'
});

var app7 = new Vue({
    el:'#app-7',
    data:{
        groceryList: [
            {id:0 , text :'Vegetables'},
            {id:1 , text :'Chese'},
            {id:2 , text :'what else human are supposed to ead'}
        ]
    }
});

