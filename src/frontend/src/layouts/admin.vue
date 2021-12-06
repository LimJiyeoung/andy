<template>
  <v-app>
    <Navbar></Navbar>

    <v-app-bar app>
    </v-app-bar>

    <v-main>
      <v-container fluid>
        <router-view></router-view>
      </v-container>
    </v-main>

    <v-footer>
      <v-col class="text-center" cols="12">
        <strong>Admin Layout</strong>
      </v-col>
    </v-footer>
  </v-app>
</template>

<script>
import Navbar from "@/layouts/components/Navbar";
export default {
  name: 'AdminLayout',
  data: () => ({
  }),
  components: {
    Navbar
  }
}
</script>
