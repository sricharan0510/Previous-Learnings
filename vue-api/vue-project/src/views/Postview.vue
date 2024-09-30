<template>
<div class="posts">
<h1>Posts</h1>

<ul>
    <Li
    v-for="post in posts"
    :key="post.id"
    >
        <RouterLink to="/postDetail/${{ post.id }}">{{ post.title }}</RouterLink>
    </Li>
</ul>

<textarea v-autofocus />
</div>
</template>

<script setup>
import { ref } from 'vue';
import { vAutofocus } from '../directives/vAutofocus.js'

const posts = ref([
    {
        id: 'id1',
        title: 'Post 1'
    },
    {
        id: 'id2',
        title: 'Post 2'
    },
    {
        id: 'id3',
        title: 'Post 3'
    },
])
</script>

<style scoped>
ul{
    margin-bottom : 30px;
}</style>
