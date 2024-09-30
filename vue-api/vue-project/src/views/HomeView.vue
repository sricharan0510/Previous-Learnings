<template>
 <div class="home">
    <h3>{{ counterTitle }}</h3>
     <button @click="decreaseCounter(2)" class="btn">--</button>
     <button @click="decreaseCounter(1)" class="btn">-</button>
     <span class="counter">{{ CounterData.count }}</span>
     <button @click="increaseCounter(1)" class="btn">+</button>
     <button @click="increaseCounter(2)" class="btn">++</button>
    </div>

    <p>The Count is {{ oddOrEven }}</p>

    <div class="edit">
        <h4>Edit the title:</h4>
        <input v-model="counterTitle" type="text" v-autofocus="vAutofocus">
    </div>
</template>


<script setup>

import { ref , reactive , computed ,watch} from 'vue'
import { vAutofocus } from '@/directives/vAutofocus'

const counterTitle = ref('MyCounter')

const CounterData = reactive({
    count:0
})
        const increaseCounter = (amount) =>{
            CounterData.count += amount
        }
        const decreaseCounter = (amount) =>{
            CounterData.count -= amount
        }
        
watch(() => CounterData.count,(newCount,oldCount) =>{
    if(newCount === 10)
    alert("The choices are over!")
})

const oddOrEven = computed(() => {
    if( CounterData.count % 2 === 0 ) return 'Even'
    else return 'Odd'
})


</script> 


<!-- 
 <script>
import { ref } from 'vue'
export default {
    setup(){
        const counter = ref(0)
        const increaseCounter = () =>{
            counter.value++
        }
        const decreaseCounter = () =>{
            counter.value--
        }
    
    return{
        counter,
        increaseCounter,
        decreaseCounter
    }
}
}
</script>  -->


<!--
<script>
export default {
    data(){
        return {
            counter : 0
    }
},
    methods :{
        increaseCounter(){
            this.counter++
        },
        decreaseCounter(){
            this.counter--
        }
}
}
</script> -->



    <style>
    .home{
        text-align:center;
        padding: 20px;
    }
    .btn, .counter{
        font-size: 40px;
        margin: 20px;
    }
    .edit{
        text-align: center;
        margin-top: 60px;
        margin: 20px;
    }
    p{
        text-align: center;
    }
    </style>
    
     