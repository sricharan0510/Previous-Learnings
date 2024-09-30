<template>
    <div class="modals">
        <h style="font-size: large;"><b>Modals</b></h><br>
        <button @click="showmodel=true">Show</button><br>
        <p1 v-if="showmodel">Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui quos eligendi commodi? Repellendus amet dolorum nemo, dicta aperiam natus minima at, accusantium, quod animi dolor ea sapiente non? Cupiditate, voluptatem.</p1>
        <br>
        <button @click="showmodel=false">Hide</button>
     </div>
</template>
<script setup>
import { ref } from 'vue'
const showmodel = ref(true)
</script>