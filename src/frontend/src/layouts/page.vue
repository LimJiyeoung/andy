<template>
  <v-app>
    <v-app-bar app>
    </v-app-bar>

    <v-main>
      <v-container fluid>
        <router-view></router-view>
      </v-container>
    </v-main>

    <v-footer app>
      <v-col class="text-center" cols="12">
        <strong>Page Layout</strong>
      </v-col>
    </v-footer>
  </v-app>
</template>

<script>
export default {
  name: 'PageLayout'
}
</script>
